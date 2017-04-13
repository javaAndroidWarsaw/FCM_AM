package com.softwareacademy.maps.fcmproject.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 *
 */

public class TokenService extends FirebaseInstanceIdService {

    public static final String TAG = "TOKEN_SERVICE";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        //e1KIINH2Av8:APA91bHvL19ew9J3XKKrDMlRG-ssbN1pnlfoDUGqVOp5fZEgFPPWN2ETvOHcJ3R2o_9e_TR9l8PP-ZND648qnPtuawJN2fhilLWx-XvVtHOkjLbKL9yXynwj5tSgEM3kN_ztwxRQh7W3
        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
    }
}
