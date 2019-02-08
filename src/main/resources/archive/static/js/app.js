let links = document.querySelectorAll('a');
for (let i = 0; i < links.length; i++) {
    links[i].addEventListener('mouseover', function() {
        this.style.fontSize = '120%';
    });
    links[i].addEventListener('mouseout', function() {
        this.style.fontSize = '22px';
    });
}

//Geography animation: https://www.w3schools.com/howto/howto_js_animate.asp
function myMove() {
  var elem = document.getElementById("myAnimation");
  var pos = 1;
  var id = setInterval(frame, 10);
  function frame() {
    if (pos == 350) {
      clearInterval(id);
    } else {
      pos++;
      elem.style.bottom = pos + 'px';
      elem.style.left = pos + 'px';
    }
  }
}


// //copyright hover
// let copyright = document.querySelectorAll('.copyright');
// for(let i=0; i<copyright.length; i++) {
//     copyright[i].addEventListener('mouseover', function() {
//         this.innerText = 'Created By Aaron Barclay, Tiffany Chuang, Gene Chung, Leslie Geissler, Jaimie Obidike, Jesse Snyder, and Mary Ziegler';
//     });
//     copyright[i].addEventListener('mouseout', function() {
//         this.innerText = 'Copyright © 2017';
//     });
// }
