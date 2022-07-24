package ir.mapsa.galleryManagement.event;

import lombok.Data;

@Data
public class EventDTO {
    private long id;
    private String title;
    private StatusEvent status;
}
