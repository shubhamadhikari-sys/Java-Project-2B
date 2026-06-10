import java.util.*;

class User {
    String username;

    User(String username) {
        this.username = username;
    }

    public String getusername() {
        return username;
    }
}

class Message {
    User sender;
    String content, timestamp;

    Message(User sender, String content, String timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }
}

class ChatRoom {
    Message[] message;
    int messagecount;

    ChatRoom() {
        message = new Message[100];
        messagecount = 0;
    }

    void sendMessage(User user, String messageText, String time) {
        Message msg = new Message(user, messageText, time);
        message[messagecount++] = msg;
    }

    void DisplayMessage() {
        for (int i = 0; i < messagecount; i++) {
            Message msg1 = message[i];
            System.out.println("[" + msg1.timestamp + "] "
                    + msg1.sender.getusername() + ": "
                    + msg1.content);
        }
    }
}

public class main {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        ChatRoom chat = new ChatRoom();

        chat.sendMessage(user1, "Hello everyone!", "10:00 AM");
        chat.sendMessage(user2, "Hi Alice!", "10:01 AM");
        chat.sendMessage(user3, "Good morning!", "10:02 AM");

        chat.DisplayMessage();
    }
}