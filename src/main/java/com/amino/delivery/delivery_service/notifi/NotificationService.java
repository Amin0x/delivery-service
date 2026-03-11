package com.amino.delivery.delivery_service.notifi;

import java.time.LocalDateTime;
import java.util.List;

public class NotificationService {

    public List<Notification> getNotifications(String userId) {
        return List.of();
    }

    public void deleteAllNotification(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = now.minusDays(7).toLocalDate().atStartOfDay();

    }
}
