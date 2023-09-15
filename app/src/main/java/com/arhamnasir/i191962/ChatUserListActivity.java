package com.arhamnasir.i191962;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChatUserListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ChatUserListAdapter adapter;
    private List<ChatUser> chatUsers; // Replace with your user data model

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_user_list);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.chatUserListRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create a list of chat users (you can load this data from your source)
        chatUsers = createChatUserList();

        // Initialize and set the adapter
        adapter = new ChatUserListAdapter(chatUsers);
        recyclerView.setAdapter(adapter);
    }

    // Replace this with your logic to load chat user data
    private List<ChatUser> createChatUserList() {
        List<ChatUser> users = new ArrayList<>();
        // Populate the list with chat users
        users.add(new ChatUser("User 1", R.drawable.gallery));
        users.add(new ChatUser("User 2", R.drawable.camera_chat));
        // Add more users as needed
        return users;
    }
}

