package com.amino.delivery.delivery_service.notifi;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

public interface NotificationRepository extends Repository<Notification, String> {
    @Transactional
    @Modifying
    @Query("delete from Notification n where n.createdAt < ?1")
    void deleteAllBefore(LocalDateTime dateTime);
}