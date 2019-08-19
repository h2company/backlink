<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
          <c:if test="${sessionScope.auth.role == 0 }">
	          <li class=" nav-item ${active.startsWith("backlink") ? "open" : ""}"><a href="#"><i class="ft-bar-chart-2"></i><span class="menu-title" data-i18n="">Quản Lý Backlink</span></a>
	            <ul class="menu-content">
	              <li class="${active.equals("backlinkaddBackLink") ? "active" : ""}"><a class="menu-item" href="backlink/add-backlink.html">Thêm Backlink</a>
	              </li> 
	              <li class="${active.equals("backlinkaddAction") ? "active" : ""}"><a class="menu-item" href="backlink/add-action.html">Thêm Yêu Cầu Hành Động</a>
	              </li>  
	              <li class="${active.equals("backlinkstatisticalAccess") ? "active" : ""}"><a class="menu-item" href="backlink/statistical-access.html">Thống Kê Truy Cập</a>
	              </li>            
	            </ul>
	          </li>   
	          <li class=" nav-item ${active.startsWith("pay") ? "open" : ""}"><a href="#"><i class="ft-zap"></i><span class="menu-title" data-i18n="">Thanh Toán</span></a>
	            <ul class="menu-content">
	              <li class="${active.equals("payRecharge") ? "active" : ""}"><a class="menu-item" href="pay/recharge.html">Nạp tiền</a>
	              </li> 
	              <li class="${active.equals("payTransactionHistory") ? "active" : ""}"><a class="menu-item" href="pay/transaction-history.html">Lịch sử giao dịch</a>
	              </li>            
	            </ul>
	          </li>   
	      </c:if>
          <c:if test="${sessionScope.auth.role == 1 }">
	          <li class=" nav-item ${active.startsWith("revenue") ? "open" : ""}"><a href="#"><i class="ft-sunset"></i><span class="menu-title" data-i18n="">Quản Lý Doanh Thu</span></a>
	            <ul class="menu-content">
	              <li class="${active.equals("revenueAdvertisement") ? "active" : ""}"><a class="menu-item" href="revenue/advertisement.html">DT Quảng Cáo</a>
	              </li> 
	              <li class="${active.equals("revenueExchange") ? "active" : ""}"><a class="menu-item" href="revenue/exchange.html">DT Giao Dịch</a>
	              </li>           
	            </ul>
	          </li>  
	          <li class=" nav-item ${active.startsWith("point") ? "open" : ""}"><a href="#"><i class="ft-aperture"></i><span class="menu-title" data-i18n="">Quản Lý Điểm</span></a>
	            <ul class="menu-content">
	              <li class="${active.equals("pointMember") ? "active" : ""}"><a class="menu-item" href="point/member.html">Thành Viên</a>
	              </li>
	              <li class="${active.equals("pointLog") ? "active" : ""}"><a class="menu-item" href="point/log.html">Log</a>
	              </li>              
	            </ul>
	          </li> 
	          <li class=" nav-item ${active.startsWith("account") ? "open" : ""}"><a href="#"><i class="ft-users"></i><span class="menu-title" data-i18n="">Quản Lý Tài Khoản</span></a>
	            <ul class="menu-content">
	              <li class="${active.equals("accountManager") ? "active" : ""}"><a class="menu-item" href="account/manager.html">Thành Viên</a>
	              </li>            
	            </ul>
	          </li>    
          </c:if>       
        </ul>
      </div>
    </div>
