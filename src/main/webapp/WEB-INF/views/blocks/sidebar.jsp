<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="main-menu menu-fixed menu-light menu-accordion    menu-shadow " data-scroll-to-active="true" data-img="app-assets/images/backgrounds/02.jpg">
      <div class="navbar-header">
        <ul class="nav navbar-nav flex-row">
          <li class="nav-item mr-auto"><a class="navbar-brand" href="app-assets\index.html"><img class="brand-logo" alt="Chameleon admin logo" src="app-assets\images\logo\logo.png">
              <h3 class="brand-text">Chameleon</h3></a></li>
          <li class="nav-item d-md-none"><a class="nav-link close-navbar"><i class="ft-x"></i></a></li>
        </ul>
      </div>
      <div class="navigation-background"></div>
      <div class="main-menu-content">
        <ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation">
          <li class=" nav-item ${active.equals("index") ? "open" : ""}"><a href="index.html"><i class="ft-home"></i><span class="menu-title" data-i18n="">Trang Chủ</span></a></li>
          <li class=" nav-item ${active.contains("point") ? "open" : ""}"><a href="#"><i class="ft-aperture"></i><span class="menu-title" data-i18n="">Quản Lý Điểm</span></a>
            <ul class="menu-content">
              <li class="${active.equals("pointMember") ? "active" : ""}"><a class="menu-item" href="point/member.html">Thành Viên</a>
              </li>
              <li class="${active.equals("pointLog") ? "active" : ""}"><a class="menu-item" href="point/log.html">Log</a>
              </li>              
            </ul>
          </li> 
          <li class=" nav-item ${active.contains("account") ? "open" : ""}"><a href="#"><i class="ft-users"></i><span class="menu-title" data-i18n="">Quản Lý Tài Khoản</span></a>
            <ul class="menu-content">
              <li class="${active.equals("accountManager") ? "active" : ""}"><a class="menu-item" href="account/manager.html">Thành Viên</a>
              </li>
              </li>              
            </ul>
          </li>           
        </ul>
      </div>
    </div>
