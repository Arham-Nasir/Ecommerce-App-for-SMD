package com.arhamnasir.i191962;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatUserListAdapter extends RecyclerView.Adapter<ChatUserListAdapter.ChatUserViewHolder> {
    private List<ChatUser> chatUsers;

    public ChatUserListAdapter(List<ChatUser> chatUsers) {
        this.chatUsers = chatUsers;
    }

    @NonNull
    @Override
    public ChatUserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_user_item, parent, false);
        return new ChatUserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatUserViewHolder holder, int position) {
        ChatUser chatUser = chatUsers.get(position);
        holder.bind(chatUser);
    }

    @Override
    public int getItemCount() {
        return chatUsers.size();
    }

    public class ChatUserViewHolder extends RecyclerView.ViewHolder {
        private ImageView profileImageView;
        private TextView usernameTextView;

        public ChatUserViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImageView = itemView.findViewById(R.id.profileImageView);
            usernameTextView = itemView.findViewById(R.id.usernameTextView);
        }

        public void bind(ChatUser chatUser) {
            profileImageView.setImageResource(chatUser.getProfileImage());
            usernameTextView.setText(chatUser.getUsername());
        }
    }
}




