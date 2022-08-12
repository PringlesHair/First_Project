$(function () {
    $('#fullpage').fullpage({
        //options here
        anchors: ['section1', 'section2', 'section3', 'section4', 'section5'],
        navigation: true,
        navigationPosition: 'right',
        sectionsColor: ['#acc', '#bbb', '#ddd', '#eee', '#fff'],
        afterLoad: function (anchorLink, index) {
            console.log("현재 색션 번호는" + index)
            if (index == 5) {
                alert("마지막입니다.")
            }
        },
        // afterSlideLoad: function(anchorLink, index, slideAnchor, slideIndex){
        //     console.log("현재 슬라이드 번호는"+ slideIndex)
        // } // 안뜨는디..
    });
})