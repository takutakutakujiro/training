$(document).ready(function(){
  var dataURL = 'https://api.instagram.com/v1/users/self/media/recent';
  var photoData;

  var getData = function(url){
    $.ajax({
      url: url,
      dataType: 'jsonp',
      data: {
        access_token: '1325405591.8b4d66e.4fd82c0070314b499f02360a789563f5',
        count: 12
      }
    })
    .done(function(data){
      photoData = data;
      console.log(data);
      
      $(photoData.data).each(function(){

        var caption = '';
        if(this.caption){
          caption = this.caption.text;
        }

        $('#gallery').append(
          $('<div class="img_block"></div>').append(
            $('<a></a>')
            .attr('href', this.link)
            .attr('target', '_blank')
            .append(
              $('<img>').attr('src', this.images.low_resolution.url)
            )
          )
          .append(
            $('<p class="caption"></p>').text(caption + ' ♡' + this.likes.count)
          )
        );
      });
    })
    .fail(function(){
      $('#gallery').test(testStatus);
    })
  }

  getData(dataURL);
});