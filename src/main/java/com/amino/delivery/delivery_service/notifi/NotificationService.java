package com.amino.delivery.delivery_service.notifi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationService {
    List<Notification> getNotifications(String userId);
}
