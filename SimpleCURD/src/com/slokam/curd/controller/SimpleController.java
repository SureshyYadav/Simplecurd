package com.slokam.curd.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.curd.comparator.NameComparator;
import com.slokam.curd.interfaces.IAuditService;
import com.slokam.curd.pojo.Country;
import com.slokam.curd.pojo.GeoHirePojo;
import com.slokam.curd.pojo.State;
import com.slokam.curd.service.GeoHireService;
import com.slokam.curd.service.MetadataService;

@Controller
public class SimpleController {
	//Collection collection=new ArrayList();
	@Autowired
	private GeoHireService geoHireService;
	@Autowired
	private MetadataService metaDataService;
	@Autowired(required=true)
	private IAuditService auditService;
	@RequestMapping("enter")
	public ModelAndView enterDetails()
	{
		List<Country> countryList=metaDataService.getDataFromCountry();
		GeoHirePojo pojo=new GeoHirePojo();
		ModelAndView mv=new ModelAndView();
		pojo.setName("");
		pojo.setCode("");
		pojo.setEntity("");
		pojo.setStatus("");
		pojo.setId(0);
		//req.setAttribute("pojo",pojo);
		mv.addObject("countryList",countryList);
		mv.addObject("pojo",pojo);
		mv.setViewName("enter");
		return mv;
	}
	@RequestMapping("saveGeoHire.do")
	public ModelAndView saveGeoHire(GeoHirePojo pojo) throws Exception
	{
		System.out.println(pojo.getMultipart().getOriginalFilename());
		MultipartFile multipart=pojo.getMultipart();
		File file=new File("D:\\File Upload\\"+multipart.getOriginalFilename());
		System.out.println(multipart.getContentType());
		try {//D:\File Upload
			multipart.transferTo(file);
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream fis=new FileInputStream(file);
		//if()
		Workbook wk=new XSSFWorkbook(fis);
		Sheet sheet=wk.getSheetAt(0);
		List<GeoHirePojo> pojoList=new ArrayList<GeoHirePojo>();
		Iterator<Row> rows=sheet.iterator();
		rows.next();
		while(rows.hasNext()){
			GeoHirePojo pojo1=new GeoHirePojo();
			 Row ros= rows.next();
			Iterator<Cell> cells=ros.cellIterator();
			 while(cells.hasNext()){
				 Cell cell=cells.next();
				 if(cell.getColumnIndex()==0){
					 Double d=cell.getNumericCellValue();
					    pojo1.setId(d.intValue());  
					   }
					   else if(cell.getColumnIndex()==1){
					     pojo1.setName(cell.getStringCellValue());
					     }
					      else if(cell.getColumnIndex()==2){
					     pojo1.setCode(cell.getStringCellValue());
					     }
					      else if(cell.getColumnIndex()==3){
					     pojo1.setEntity(cell.getStringCellValue());
					     }
					      else if(cell.getColumnIndex()==4){
					     pojo1.setStatus(cell.getStringCellValue());
					     }
					      pojoList.add(pojo);
					     System.out.println(pojoList);
			 }
		}
				 wk.close();
				 
		geoHireService.saveGeoHire(pojo);
		//GeoHirePojo pojo1=new GeoHirePojo();
		ModelAndView mv=new ModelAndView();
		
		
		List<GeoHirePojo> pojo2=(List<GeoHirePojo>) geoHireService.getAllGeoHire();
	     List<GeoHirePojo> sublist=pojo2.subList(0, 5);
		mv.addObject("POjoList",sublist);
		mv.setViewName("displayGeoHire");
		
		return  mv;
		
	}
	@RequestMapping("displayGeoHire.do")
	public ModelAndView getAllGeoHire(HttpSession session)
	{
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		//UserDetails userDetails=(UserDetails) SecurityContextHolder.getContext().getAuthentication();
		
		session.setAttribute("pageNo", 1);
		session.setAttribute("end", true);
		
		ModelAndView mv=new ModelAndView();
		List<GeoHirePojo> pojo=(List<GeoHirePojo>) geoHireService.getAllGeoHire();
		
		List<GeoHirePojo>sublist=pojo.subList(0,5);
		session.setAttribute("name", sublist);
		mv.addObject("POjoList",sublist);
		mv.setViewName("displayGeoHire");
		return mv;
	}
	@RequestMapping("getGeoHire.do")
	public ModelAndView getGeoHire(Integer id,HttpServletRequest req,HttpSession session)
	{
		GeoHirePojo pojo=geoHireService.getGeoHire(id);
		session.setAttribute("audit", pojo);
		ModelAndView mv=new ModelAndView();
		mv.addObject("pojo",pojo);
		mv.setViewName("enter");
		req.setAttribute("pojo", pojo);
		return mv;
		
	}
	@RequestMapping("nextPageGeoHire.do")
	public ModelAndView getNextGeoHireRecord(HttpSession session)
	{
		ModelAndView mv=new ModelAndView();
		List<GeoHirePojo> pojo=(List<GeoHirePojo>) geoHireService.getAllGeoHire();
		Integer pageno=(Integer) session.getAttribute("pageNo");
		Boolean flag=(Boolean) session.getAttribute("end");
		//String end=(String) session.getAttribute("end");
		/*if(end==null||!end.equals("yes"))
		{
		pageno++;
		}*/
		//pageno++;
		if(flag)
		{
			pageno++;
		}
		int endPage=pageno*5;
		int startPage=endPage-5;
		if(pojo.size()<=endPage)
		{
			endPage=pojo.size();
			//session.setAttribute("end", "yes");
			session.setAttribute("end", false);
		}
		
		List<GeoHirePojo>sublist=pojo.subList(startPage,endPage);
		session.setAttribute("name", sublist);
		System.out.println(pojo.size());
		session.setAttribute("pageNo", pageno);
		/*List<GeoHirePojo> pojo3=(List<GeoHirePojo>) session.getAttribute("name");
		Collections.sort(pojo3,new NameComparator());*/
		mv.addObject("POjoList",sublist);
		mv.setViewName("displayGeoHire");
		
		return mv;
		
	}
	
	@RequestMapping("previousPageGeoHire.do")
	public ModelAndView getPrevousGeoHireRecord(HttpSession session)
	{
		//session.setAttribute("end", "no");
		session.setAttribute("end", true);
		ModelAndView mv=new ModelAndView();
		List<GeoHirePojo> pojo=(List<GeoHirePojo>) geoHireService.getAllGeoHire();
		Integer pageno=(Integer) session.getAttribute("pageNo");
		if(pageno!=1){
		pageno--;
		}
		int endPage=pageno*5;
		int startPage=endPage-5;
		if(pojo.size()<=endPage)
		{
			endPage=pojo.size();
			//session.setAttribute("end", "yes");
		}
		
		List<GeoHirePojo>sublist=pojo.subList(startPage,endPage);
		session.setAttribute("name", sublist);
		System.out.println(pojo.size());
		session.setAttribute("pageNo", pageno);
		mv.addObject("POjoList",sublist);
		mv.setViewName("displayGeoHire");
		
		return mv;
		
	}
	@RequestMapping("updateGeoHire.do")
	public ModelAndView updateGeoHire(GeoHirePojo pojo,HttpSession session)
	{
		GeoHirePojo old=(GeoHirePojo) session.getAttribute("audit");
		 auditService.doAudit(old, pojo);
		 geoHireService.updateGeoHIre(pojo);
		 List<GeoHirePojo> pojo2=(List<GeoHirePojo>) geoHireService.getAllGeoHire();
		ModelAndView mv=new ModelAndView();
		mv.addObject("POjoList",pojo2);
		mv.setViewName("displayGeoHire");
		return mv;
	}
	@RequestMapping("deleteGeoHire.do")
	public ModelAndView deleteGeoHire(GeoHirePojo pojo)
	{
		geoHireService.deleteGeoHire(pojo);
		List<GeoHirePojo> pojo2=(List<GeoHirePojo>) geoHireService.getAllGeoHire();
		ModelAndView mv=new ModelAndView();
		mv.addObject("POjoList",pojo2);
		mv.setViewName("displayGeoHire.jsp");
		return mv;
	}
	@RequestMapping("sortGeoHireName.do")
	public ModelAndView sortGeoHire(HttpSession session,HttpServletRequest request)
	{
		Integer option=Integer.parseInt(request.getParameter("option"));
		List<GeoHirePojo> pojo=(List<GeoHirePojo>) session.getAttribute("name");
		Collections.sort(pojo,new NameComparator(option));
		ModelAndView mv=new ModelAndView();
		//List<GeoHirePojo>sublist=pojo.subList(0,5);
		mv.addObject("POjoList",pojo);
		mv.setViewName("displayGeoHire");
		return mv;
	}
	@RequestMapping("download.do")
	public void downloadFile(String file,HttpServletResponse response) throws Exception
	{
		
		response.setHeader("Content-Disposition","attachment;filename="+file);
		 FileInputStream fis=new FileInputStream("D:\\File Upload\\"+file);
		OutputStream os= response.getOutputStream();
		   int data=  fis.read();
		      while(data!=-1)
		      os.write(data);
		      data=fis.read();
		      os.close();
		      //return mv;
	}
	@RequestMapping("getState.do")
	public ModelAndView getState(GeoHirePojo pojo1)
	{
		List<State> stateList=metaDataService.getDataFromState(pojo1.getCountryId());
		List<Country> countryList=metaDataService.getDataFromCountry();
		GeoHirePojo pojo=new GeoHirePojo();
		ModelAndView mv=new ModelAndView();
		pojo.setName("");
		pojo.setCode("");
		pojo.setEntity("");
		pojo.setStatus("");
		pojo.setId(0);
		//req.setAttribute("pojo",pojo);
		mv.addObject("stateList",stateList);
		mv.addObject("countryList",countryList);
		mv.addObject("pojo",pojo);
		mv.setViewName("enter");
		return mv;
	}
}
