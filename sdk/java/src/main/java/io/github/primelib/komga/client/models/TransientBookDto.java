// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Instant;
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
 * TransientBookDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("TransientBookDto")
@JsonPropertyOrder({
    "id",
    "name",
    "url",
    "fileLastModified",
    "sizeBytes",
    "size",
    "status",
    "mediaType",
    "pages",
    "files",
    "comment"
})
@Generated(value = "io.github.primelib.primecodegen")
public class TransientBookDto {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("url")
    protected String url;

    @JsonProperty("fileLastModified")
    protected java.time.Instant fileLastModified;

    @JsonProperty("sizeBytes")
    protected Long sizeBytes;

    @JsonProperty("size")
    protected String size;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("mediaType")
    protected String mediaType;

    @JsonProperty("pages")
    protected PageDto[] pages;

    @JsonProperty("files")
    protected String[] files;

    @JsonProperty("comment")
    protected String comment;

    /**
     * Constructs a validated instance of {@link TransientBookDto}.
     *
     * @param spec the specification to process
     */
    public TransientBookDto(Consumer<TransientBookDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TransientBookDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TransientBookDto(Consumer)} instead.
     * @param id id
     * @param name name
     * @param url url
     * @param fileLastModified fileLastModified
     * @param sizeBytes sizeBytes
     * @param size size
     * @param status status
     * @param mediaType mediaType
     * @param pages pages
     * @param files files
     * @param comment comment
     */
    @ApiStatus.Internal
    public TransientBookDto(String id, String name, String url, Instant fileLastModified, Long sizeBytes, String size, String status, String mediaType, PageDto[] pages, String[] files, String comment) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.fileLastModified = fileLastModified;
        this.sizeBytes = sizeBytes;
        this.size = size;
        this.status = status;
        this.mediaType = mediaType;
        this.pages = pages;
        this.files = files;
        this.comment = comment;
    }
}
