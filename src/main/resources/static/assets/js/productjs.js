// Lấy tham chiếu đến các phần tử
var updateLinks = document.querySelectorAll('.update-link');
var updateButton = document.getElementById('update-tab');

// Gán sự kiện click cho tất cả các nút link
updateLinks.forEach(function(link) {
    link.addEventListener('click', function(event) {
        event.preventDefault(); // Ngăn chặn hành vi mặc định của liên kết

        // Kích hoạt tab "updatetab"
        var tab = new bootstrap.Tab(updateButton);
        tab.show();
    });
});