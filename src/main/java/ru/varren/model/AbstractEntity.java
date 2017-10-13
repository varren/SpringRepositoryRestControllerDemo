package ru.varren.model;

/**
 * Created by varren on 14.10.17.
 */
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@MappedSuperclass
public abstract class AbstractEntity {
    
    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
