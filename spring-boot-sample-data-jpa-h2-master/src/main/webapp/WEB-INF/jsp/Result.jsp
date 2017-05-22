

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.6
Version: 4.5.4
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" dir="rtl">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->

    <head>
        <meta charset="utf-8" />
        <title></title>
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
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="css/components-md-rtl.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="css/plugins-md-rtl.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <link href="layouts/layout4/css/layout-rtl.min.css" rel="stylesheet" type="text/css" />
        <link href="layouts/layout4/css/themes/light-rtl.min.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="layouts/layout4/css/custom-rtl.min.css" rel="stylesheet" type="text/css" />
        <link href="css/My.css" rel="stylesheet" type="text/css" />
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="favicon.ico" /> </head>
    <!-- END HEAD -->

    <body class="page-container-bg-solid page-header-fixed page-sidebar-closed-hide-logo page-md">
        <!-- BEGIN HEADER -->
        <div class="page-header navbar navbar-fixed-top">
            <!-- BEGIN HEADER INNER -->
            <div class="page-header-inner ">
                <!-- BEGIN LOGO -->
                <div class="page-logo">
                    
                </div>
                <!-- END LOGO -->
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
                <!-- END RESPONSIVE MENU TOGGLER -->
                <!-- BEGIN PAGE ACTIONS -->
                <!-- DOC: Remove "hide" class to enable the page header actions -->
                
                <!-- END PAGE ACTIONS -->
                <!-- BEGIN PAGE TOP -->
                <div class="page-top">
                    <!-- BEGIN HEADER SEARCH BOX -->
                    <!-- DOC: Apply "search-form-expanded" right after the "search-form" class to have half expanded search box -->
                    <form class="search-form" action="page_general_search_2.html" method="GET">
                        <div class="input-group">
                            <input type="text" class="form-control input-sm" placeholder="Search..." name="query">
                            <span class="input-group-btn">
                                <a href="javascript:;" class="btn submit">
                                    <i class="icon-magnifier"></i>
                                </a>
                            </span>
                        </div>
                    </form>
                    <!-- END HEADER SEARCH BOX -->
                    <!-- BEGIN TOP NAVIGATION MENU -->
                    <div class="top-menu">
                        <ul class="nav navbar-nav pull-right">
                            <li class="separator hide"> </li>
                            <!-- BEGIN NOTIFICATION DROPDOWN -->
                            <!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->




                            





                            <!-- END INBOX DROPDOWN -->
                            
                            <!-- END TODO DROPDOWN -->
                            <!-- BEGIN USER LOGIN DROPDOWN -->
                            <!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
                            
                            <!-- END USER LOGIN DROPDOWN -->
                            <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                            <li class="dropdown dropdown-extended quick-sidebar-toggler">
                                <span class="sr-only">Toggle Quick Sidebar</span>
                                <i class="icon-logout"></i>
                            </li>
                            <!-- END QUICK SIDEBAR TOGGLER -->
                        </ul>
                    </div>
                    <!-- END TOP NAVIGATION MENU -->
                </div>
                <!-- END PAGE TOP -->
            </div>
            <!-- END HEADER INNER -->
        </div>
        <!-- END HEADER -->
        <!-- BEGIN HEADER & CONTENT DIVIDER -->
        <div class="clearfix"> </div>
        <!-- END HEADER & CONTENT DIVIDER -->
        <!-- BEGIN CONTAINER -->
        <div class="page-container">
            <!-- BEGIN SIDEBAR -->
            <div class="page-sidebar-wrapper">
                <!-- BEGIN SIDEBAR -->
                <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                <div class="page-sidebar navbar-collapse collapse">
                    <!-- BEGIN SIDEBAR MENU -->
                    <!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
                    <!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
                    <!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
                    <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                    <!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
                    <!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                    <ul class="page-sidebar-menu   " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
                        <li class="nav-item start ">
                            <a href="Dashboard.jsp" class="nav-link nav-toggle">
                                <i class="icon-home"></i>
                                <span class="title">داشبورد</span>
                               
                            </a>
                           
                        </li>
                        <li class="heading">
                            <h3 class="uppercase">گلستان</h3>
                        </li>
                        <li class="nav-item  ">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-diamond"></i>
                                <span class="title">صفحات کاربر</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-menu">

                                <li class="nav-item  ">
                                    <a href="/take" class="nav-link ">
                                        <span class="title">اخذ درس</span>
                                    </a>
                                </li>
                                <%--<li class="nav-item  ">--%>
                                <%--<a href="DefineLesson.jsp" class="nav-link ">--%>
                                <%--<span class="title">تعریف/تغییر درس</span>--%>
                                <%--</a>--%>
                                <%--</li>--%>
                                <li class="nav-item  ">
                                    <a href="/result" class="nav-link ">
                                        <span class="title">کارنامه ترمی</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="/profile" class="nav-link ">
                                        <span class="title">ویرایش حساب</span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="/log_out" class="nav-link ">
                                        <span class="title">خروج</span>
                                    </a>
                                </li>
                                
                                
                            </ul>
                        </li>











                        










                    </ul>
                    <!-- END SIDEBAR MENU -->
                </div>
                <!-- END SIDEBAR -->
            </div>
            <!-- END SIDEBAR -->
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <!-- BEGIN CONTENT BODY -->
                <div class="page-content">
                    <!-- BEGIN PAGE HEAD-->
                    <div class="page-head">
                        <!-- BEGIN PAGE TITLE -->
                        <div class="page-title">
                            <h1>کارنامه ترمی
                                <small> دانشجو</small>
                            </h1>
                        </div>
                        <!-- END PAGE TITLE -->
                        <!-- BEGIN PAGE TOOLBAR -->



                        








                        <!-- END PAGE TOOLBAR -->
                    </div>
                    <!-- END PAGE HEAD-->
                    <!-- BEGIN PAGE BREADCRUMB -->
                    <ul class="page-breadcrumb breadcrumb">
                        <li>
                            <a href="#">Home</a>
                            <i class="fa fa-circle"></i>
                        </li>
                        
                    </ul>
                    <!-- END PAGE BREADCRUMB -->
                    <!-- BEGIN PAGE BASE CONTENT -->



                    <div class="row">
                            
                        <div class="col-md-12">
                            


                                <div class="portlet light bordered">
                                            <div class="portlet-title">
                                                <div class="caption">
                                                    <i class="icon-equalizer font-red-sunglo"></i>
                                                    <span class="caption-subject font-red-sunglo bold uppercase">فرم
                                                </div>
                                                <div class="tools">
                                                    <a href="" class="collapse"> </a>
                                                    <a href="#portlet-config" data-toggle="modal" class="config"> </a>
                                                    <a href="" class="reload"> </a>
                                                    <!-- <a href="" class="remove"> </a> -->
                                                </div>
                                            </div>
                                            <div class="portlet-body form">
                                                <!-- BEGIN FORM-->
                                                <form action="select_result" method="post" class="form-horizontal">
                                                    <div class="form-body">
                                                        <h3 class="form-section" style="font-family: 'nasim'">لیست ترم</h3>
                                                        <div class="row">
                                                            <div class="col-md-6">
                                                                <div class="form-group">
                                                                    <label class="control-label col-md-3"> کد ترم</label>
                                                                    <div class="col-md-9">
                                                                        <input type="text" name="term" class="form-control" placeholder="کد ترم">
                                                                        
                                                                    </div>

                                                                </div>
                                                            </div>
                                                            <!--/span-->
                                                            <div class="col-md-6">
                                                                <div class="form-group">
                                                                    
                                                                    <label class="control-label col-md-3">کد سال</label>
                                                                    <div class="col-md-9">
                                                                        <input type="text" name="year" class="form-control" placeholder="کد سال">

                                                                    </div>

                                                                </div>
                                                            </div>
                                                            <!--/span-->
                                                        </div>
                                                        <!--/row-->
                                                        
                                                        <!-- <h3 class="form-section">Address</h3> -->
                                                        <!--/row-->
                                                        

                                                        
                                                        <!--/row-->
                                                        
                                                        <!--/row-->
                                                    </div>
                                                    <div class="form-actions">
                                                        <div class="row">
                                                            <div class="col-md-6">
                                                                <div class="row">
                                                                    <div class="col-md-offset-3 col-md-9">
                                                                        <button type="submit" class="btn green">ارسال</button>
                                                                        <button type="button" class="btn default">لغو</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="col-md-6"> </div>
                                                        </div>
                                                    </div>
                                                </form>
                                                <!-- END FORM-->
                                            </div>
                                        </div>


                        </div>


                    </div>



                    <div class="row">
                        <div class="col-md-12">
                            <div class="note note-success">
                                <p> در جدول زیر لیست درس ها و نمره ها نوشته شده است.</p>
                            </div>
                            <!-- BEGIN SAMPLE TABLE PORTLET-->
                            <div class="portlet box green">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="fa fa-cogs"></i> کارنامه </div>
                                    <div class="tools">
                                        <a href="javascript:;" class="collapse"> </a>
                                        <a href="#portlet-config" data-toggle="modal" class="config"> </a>
                                        <a href="javascript:;" class="reload"> </a>
                                        
                                    </div>
                                </div>
                                <div class="portlet-body flip-scroll">
                                    <table class="table table-bordered table-striped table-condensed flip-content">
                                        <thead class="flip-content">
                                            <tr>
                                                <th width="20%"> کد درس  </th>
                                                <th> نام درس </th>
                                                <th class="numeric"> تعداد واحد </th>
                                                <th class="numeric"> نوع درس  </th>
                                                <th class="numeric"> کد استاد  </th>
                                                <th class="numeric"> نام استاد  </th>
                                                <th class="numeric"> سال </th>
                                                <th class="numeric"> ترم  </th>
                                                <th class="numeric"> نمره  </th>


                                            </tr>
                                        </thead>
                                        <tbody>

                                        <c:forEach var="sel" items="${Course}">
                                            <tr>

                                                <td> <c:out value="${sel.courseID.courseID}"/> </td>
                                                <td> <c:out value="${sel.courseID.courseName}"/> </td>
                                                <td> <c:out value="${sel.courseID.courseScore}"/> </td>
                                                <td> <c:out value="${sel.courseID.courseType}"/> </td>
                                                <td> <c:out value="${sel.profID.profID}"/> </td>
                                                <td> <c:out value="${sel.profID.profName}"/> </td>
                                                <td> <c:out value="${sel.year}"/> </td>
                                                <td> <c:out value="${sel.term}"/> </td>
                                                <td> <c:out value="${sel.score}"/> </td>

                                            </tr>
                                        </c:forEach>

                                            
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- END SAMPLE TABLE PORTLET-->
                            <!-- BEGIN SAMPLE TABLE PORTLET-->
                            
                            <!-- END SAMPLE TABLE PORTLET-->
                            <!-- BEGIN SAMPLE TABLE PORTLET-->
                            
                            <!-- END SAMPLE TABLE PORTLET-->
                            <!-- BEGIN SAMPLE TABLE PORTLET-->
                            
                            <!-- END SAMPLE TABLE PORTLET-->
                            <!-- BEGIN SAMPLE TABLE PORTLET-->
                            
                            <!-- END SAMPLE TABLE PORTLET-->
                        </div>
                    </div>

                    <div class="row">
                            
                        <div class="col-md-12">
                            


                                <div class="portlet light bordered">
                                            <div class="portlet-title">
                                                <div class="caption">
                                                    <i class="icon-equalizer font-red-sunglo"></i>
                                                    <span class="caption-subject font-red-sunglo bold uppercase">فرم
                                                </div>
                                                <div class="tools">
                                                    <a href="" class="collapse"> </a>
                                                    <a href="#portlet-config" data-toggle="modal" class="config"> </a>
                                                    <a href="" class="reload"> </a>
                                                    <!-- <a href="" class="remove"> </a> -->
                                                </div>
                                            </div>
                                            <div class="portlet-body form">
                                                <!-- BEGIN FORM-->
                                                <p> معدل این ترم ${avg} میباشد .</p>
                                                
                                                <!-- END FORM-->
                                            </div>
                                        </div>


                        </div>


                    </div>









                    <!-- END PAGE BASE CONTENT -->
                </div>
                <!-- END CONTENT BODY -->
            </div>
            <!-- END CONTENT -->
            <!-- BEGIN QUICK SIDEBAR -->
            <a href="javascript:;" class="page-quick-sidebar-toggler">
                <i class="icon-login"></i>
            </a>





















            <!-- END QUICK SIDEBAR -->
        </div>
        <!-- END CONTAINER -->
        <!-- BEGIN FOOTER -->
        <div class="page-footer">
            
            <div class="scroll-to-top">
                <i class="icon-arrow-up"></i>
            </div>
        </div>
        <!-- END FOOTER -->
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
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="scripts/app.min.js" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <script src="layouts/layout4/scripts/layout.min.js" type="text/javascript"></script>
        <script src="layouts/layout4/scripts/demo.min.js" type="text/javascript"></script>
        <script src="layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
        <!-- END THEME LAYOUT SCRIPTS -->
    </body>

</html>