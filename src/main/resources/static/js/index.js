$(window).ready(() => connect());

function connect(){
    let socket = new SockJS("/websocket");
    let stompClient = Stomp.over(socket);
    stompClient.connect({}, (frame) => {
        stompClient.subscribe("/topic/push-notification", (notification) => {
            $("#textArea").val(notification);
        })
    });
}