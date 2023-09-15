package com.arhamnasir.i191962;//package com.example.i191962;
//
//import android.content.Context;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.recyclerview.widget.RecyclerView;
//import com.sendbird.android.UserMessage;
//import com.sendbird.android.UserMessage;
//import com.example.i191962.Utils; // Replace with the correct package path
//
//import java.util.List;
//
//public class ReceivedMessageHolder extends RecyclerView.ViewHolder {
//    private Context mContext; // Add this line
//
//    TextView messageText, timeText, nameText;
//    ImageView profileImage;
//
//    ReceivedMessageHolder(Context context, View itemView) { // Change the constructor
//        super(itemView);
//        mContext = context; // Initialize the mContext variable
//
//        messageText = itemView.findViewById(R.id.text_gchat_user_other);
//        timeText = itemView.findViewById(R.id.text_gchat_timestamp_other);
//        nameText = itemView.findViewById(R.id.text_gchat_message_other);
//        profileImage = itemView.findViewById(R.id.image_gchat_profile_other);
//    }
//
//    void bind(UserMessage message) {
//        messageText.setText(message.getMessage());
//        // Format the stored timestamp into a readable String using method.
//        timeText.setText(Utils.formatDateTime(message.getCreatedAt()));
//        nameText.setText(message.getSender().getNickname());
//        // Insert the profile image from the URL into the ImageView.
//        Utils.displayRoundImageFromUrl(mContext, message.getSender().getProfileUrl(), profileImage);
//    }
//}
