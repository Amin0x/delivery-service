package com.amino.delivery.delivery_service.notifi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "tbl_notifications")
public class Notification {
    @Id
    private String id;
    private String notificationValue;
    private String createdAt;
    private String updateAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotificationValue() {
        return notificationValue;
    }

    public void setNotificationValue(String notificationValue) {
        this.notificationValue = notificationValue;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}
