
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!-- 
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" dir="rtl">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->

    <head>
        <meta charset="utf-8" />
        <title> User Login </title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
        <link href="plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
        <link href="plugins/bootstrap/css/bootstrap-rtl.min.css" rel="stylesheet" type="text/css" />
        <link href="plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
        <link href="plugins/bootstrap-switch/css/bootstrap-switch-rtl.min.css" rel="stylesheet" type="text/css" />
        <!-- END GLOBAL MANDATORY STYLES -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <link href="plugins/select2/css/select2.min.css" rel="stylesheet" type="text/css" />
        <link href="plugins/select2/css/select2-bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="css/components-md-rtl.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="css/plugins-md-rtl.min.css" rel="stylesheet" type="text/css" />
        <link href="css/My.css" rel="stylesheet" type="text/css" />
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN PAGE LEVEL STYLES -->
        <link href="pages/css/login-rtl.min.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="favicon.ico" /> </head>
    <!-- END HEAD -->

    <body class=" login">
        <!-- BEGIN LOGO -->
        <div class="logo">
            <%--<a href="index.html">--%>
                <%--<img src="pages/img/logo-big.png" alt="" /> </a>--%>
        </div>
        <!-- END LOGO -->
        <!-- BEGIN LOGIN -->
        <div class="content">
            <!-- BEGIN LOGIN FORM -->
            <form class="login-form" action="/LoginController" method="post">
                <h3 class="form-title font-green">ورود دانشجو</h3>

                <div class="alert alert-danger display-hide">
                    <button class="close" data-close="alert"></button>
                    <span> نام کاربری و گذرواژه خود را وارد کنید </span>


                </div>
                <div class="form-group">
                    <h5 style="font-family: nasim ; text-align: center ; color: #ffcc00" >${msg } </h5>
                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                    <label class="control-label visible-ie8 visible-ie9">نام کاربری</label>
                    <input name="username" id="username" class="form-control form-control-solid placeholder-no-fix" type="number" autocomplete="off" placeholder="نام کاربری" name="username" /> </div>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">گذرواژه</label>
                    <input name="password" id="password" class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off" placeholder="گذرواژه" name="password" /> </div>
                <div class="form-actions">
                    <button type="submit" class="btn green uppercase">ورود</button>
                    <label class="rememberme check">
                        <input type="checkbox" name="remember" value="1" />مرا به خاطر بسپار </label>
                    <a href="javascript:;" id="forget-password" class="forget-password">فراموشی رمز عبور ؟ </a>
                </div>
                
                
            </form>
            <!-- END LOGIN FORM -->
            <!-- BEGIN FORGOT PASSWORD FORM -->
            <form class="forget-form" action="index.html" method="post">
                <h3 class="font-green">رمز عبور را فراموش کرده اید ؟ </h3>
                <p>ایمیل خود را وارد کرده تا رمز عبور برای شما ارسال گردد.</p>
                <div class="form-group">
                    <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="ایمیل" name="email" /> </div>
                <div class="form-actions">
                    <button type="button" id="back-btn" class="btn btn-default">بازگشت</button>
                    <button type="submit" class="btn btn-success uppercase pull-right">ارسال</button>
                </div>
            </form>
            <!-- END FORGOT PASSWORD FORM -->
            <!-- BEGIN REGISTRATION FORM -->
            
            <!-- END REGISTRATION FORM -->
        </div>
        <div class="copyright"> 2014 ©Sajad Corp </div>
        <!--[if lt IE 9]>
<script src="plugins/respond.min.js"></script>
<script src="plugins/excanvas.min.js"></script> 
<![endif]-->
        <!-- BEGIN CORE PLUGINS -->
        <script src="plugins/jquery.min.js" type="text/javascript"></script>
        <script src="plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="plugins/js.cookie.min.js" type="text/javascript"></script>
        <script src="plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
        <script src="plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
        <script src="plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="plugins/jquery-validation/js/additional-methods.min.js" type="text/javascript"></script>
        <script src="plugins/select2/js/select2.full.min.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="scripts/app.min.js" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="pages/scripts/login.min.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL SCRIPTS -->
        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <!-- END THEME LAYOUT SCRIPTS -->
    </body>

</html>