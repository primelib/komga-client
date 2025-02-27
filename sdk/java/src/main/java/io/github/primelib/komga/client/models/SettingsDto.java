// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * SettingsDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("SettingsDto")
@JsonPropertyOrder({
    "deleteEmptyCollections",
    "deleteEmptyReadLists",
    "rememberMeDurationDays",
    "thumbnailSize",
    "taskPoolSize"
})
@Generated(value = "io.github.primelib.primecodegen")
public class SettingsDto {

    @JsonProperty("deleteEmptyCollections")
    protected Boolean deleteEmptyCollections;

    @JsonProperty("deleteEmptyReadLists")
    protected Boolean deleteEmptyReadLists;

    @JsonProperty("rememberMeDurationDays")
    protected Long rememberMeDurationDays;

    @JsonProperty("thumbnailSize")
    protected String thumbnailSize;

    @JsonProperty("taskPoolSize")
    protected Integer taskPoolSize;

    /**
     * Constructs a validated instance of {@link SettingsDto}.
     *
     * @param spec the specification to process
     */
    public SettingsDto(Consumer<SettingsDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SettingsDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SettingsDto(Consumer)} instead.
     * @param deleteEmptyCollections deleteEmptyCollections
     * @param deleteEmptyReadLists deleteEmptyReadLists
     * @param rememberMeDurationDays rememberMeDurationDays
     * @param thumbnailSize thumbnailSize
     * @param taskPoolSize taskPoolSize
     */
    @ApiStatus.Internal
    public SettingsDto(Boolean deleteEmptyCollections, Boolean deleteEmptyReadLists, Long rememberMeDurationDays, String thumbnailSize, Integer taskPoolSize) {
        this.deleteEmptyCollections = deleteEmptyCollections;
        this.deleteEmptyReadLists = deleteEmptyReadLists;
        this.rememberMeDurationDays = rememberMeDurationDays;
        this.thumbnailSize = thumbnailSize;
        this.taskPoolSize = taskPoolSize;
    }
}
