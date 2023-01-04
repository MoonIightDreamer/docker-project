$(document).ready(function () {
     $("#add").click(postHandler);
      function postHandler(e) {
            e.preventDefault();

            $.ajax({
                url: 'http://localhost:8090/api/users/',
                dataType: 'json',
                contentType: "application/json",
                type: 'POST',
                data: JSON.stringify({
                    name: $('#name').val(),
                })
            }).done(function (us) {
                $('p').text(`Здравствуйте, ${us.name}`);
            }).fail(function (xhr, status, errorThrown) {
                console.log("Error: " + errorThrown);
                console.log("Status: " + status);
                console.dir(xhr);
            })
        }
    }
)

