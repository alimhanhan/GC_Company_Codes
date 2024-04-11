/* global bootstrap: false */
(() => {
  'use strict'
  const tooltipTriggerList = Array.from(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
  tooltipTriggerList.forEach(tooltipTriggerEl => {
    new bootstrap.Tooltip(tooltipTriggerEl)
  })
})()

$(document).ready(function() {
  // .btn-toggle-nav의 하위 링크에 대한 클릭 이벤트 리스너를 추가합니다.
  $('.btn-toggle-nav a').click(function() {
    // 클릭한 메뉴 항목에 'active' 클래스를 추가합니다.
    $(this).addClass('active');
  });
});

$(document).ready(function() {
  // 현재 페이지 URL을 가져옵니다.
  var currentUrl = window.location.pathname;

  let accordionMenu = $("#menuList");

  // 현재 페이지 URL과 일치하는 accordion menu 항목을 찾습니다.
  var matchingItem = accordionMenu.find(".accordion-item a[href='" + currentUrl + "']");

  // 일치하는 accordion menu 항목을 펼칩니다.
  matchingItem.closest(".accordion-button").removeClass("collapsed");
  matchingItem.closest(".accordion-collapse").addClass("show");

  // accordion menu 항목의 상태를 저장합니다.
  matchingItem.closest(".accordion-item").attr("aria-expanded", "true");
  matchingItem.addClass('active');
});