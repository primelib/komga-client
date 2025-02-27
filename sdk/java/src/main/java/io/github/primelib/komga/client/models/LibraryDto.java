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
 * LibraryDto
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("LibraryDto")
@JsonPropertyOrder({
    "id",
    "name",
    "root",
    "importComicInfoBook",
    "importComicInfoSeries",
    "importComicInfoCollection",
    "importComicInfoReadList",
    "importComicInfoSeriesAppendVolume",
    "importEpubBook",
    "importEpubSeries",
    "importMylarSeries",
    "importLocalArtwork",
    "importBarcodeIsbn",
    "scanForceModifiedTime",
    "scanInterval",
    "scanOnStartup",
    "scanCbx",
    "scanPdf",
    "scanEpub",
    "scanDirectoryExclusions",
    "repairExtensions",
    "convertToCbz",
    "emptyTrashAfterScan",
    "seriesCover",
    "hashFiles",
    "hashPages",
    "analyzeDimensions",
    "oneshotsDirectory",
    "unavailable"
})
@Generated(value = "io.github.primelib.primecodegen")
public class LibraryDto {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("root")
    protected String root;

    @JsonProperty("importComicInfoBook")
    protected Boolean importComicInfoBook;

    @JsonProperty("importComicInfoSeries")
    protected Boolean importComicInfoSeries;

    @JsonProperty("importComicInfoCollection")
    protected Boolean importComicInfoCollection;

    @JsonProperty("importComicInfoReadList")
    protected Boolean importComicInfoReadList;

    @JsonProperty("importComicInfoSeriesAppendVolume")
    protected Boolean importComicInfoSeriesAppendVolume;

    @JsonProperty("importEpubBook")
    protected Boolean importEpubBook;

    @JsonProperty("importEpubSeries")
    protected Boolean importEpubSeries;

    @JsonProperty("importMylarSeries")
    protected Boolean importMylarSeries;

    @JsonProperty("importLocalArtwork")
    protected Boolean importLocalArtwork;

    @JsonProperty("importBarcodeIsbn")
    protected Boolean importBarcodeIsbn;

    @JsonProperty("scanForceModifiedTime")
    protected Boolean scanForceModifiedTime;

    @JsonProperty("scanInterval")
    protected String scanInterval;

    @JsonProperty("scanOnStartup")
    protected Boolean scanOnStartup;

    @JsonProperty("scanCbx")
    protected Boolean scanCbx;

    @JsonProperty("scanPdf")
    protected Boolean scanPdf;

    @JsonProperty("scanEpub")
    protected Boolean scanEpub;

    @JsonProperty("scanDirectoryExclusions")
    protected String[] scanDirectoryExclusions;

    @JsonProperty("repairExtensions")
    protected Boolean repairExtensions;

    @JsonProperty("convertToCbz")
    protected Boolean convertToCbz;

    @JsonProperty("emptyTrashAfterScan")
    protected Boolean emptyTrashAfterScan;

    @JsonProperty("seriesCover")
    protected String seriesCover;

    @JsonProperty("hashFiles")
    protected Boolean hashFiles;

    @JsonProperty("hashPages")
    protected Boolean hashPages;

    @JsonProperty("analyzeDimensions")
    protected Boolean analyzeDimensions;

    @JsonProperty("oneshotsDirectory")
    protected String oneshotsDirectory;

    @JsonProperty("unavailable")
    protected Boolean unavailable;

    /**
     * Constructs a validated instance of {@link LibraryDto}.
     *
     * @param spec the specification to process
     */
    public LibraryDto(Consumer<LibraryDto> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LibraryDto}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LibraryDto(Consumer)} instead.
     * @param id id
     * @param name name
     * @param root root
     * @param importComicInfoBook importComicInfoBook
     * @param importComicInfoSeries importComicInfoSeries
     * @param importComicInfoCollection importComicInfoCollection
     * @param importComicInfoReadList importComicInfoReadList
     * @param importComicInfoSeriesAppendVolume importComicInfoSeriesAppendVolume
     * @param importEpubBook importEpubBook
     * @param importEpubSeries importEpubSeries
     * @param importMylarSeries importMylarSeries
     * @param importLocalArtwork importLocalArtwork
     * @param importBarcodeIsbn importBarcodeIsbn
     * @param scanForceModifiedTime scanForceModifiedTime
     * @param scanInterval scanInterval
     * @param scanOnStartup scanOnStartup
     * @param scanCbx scanCbx
     * @param scanPdf scanPdf
     * @param scanEpub scanEpub
     * @param scanDirectoryExclusions scanDirectoryExclusions
     * @param repairExtensions repairExtensions
     * @param convertToCbz convertToCbz
     * @param emptyTrashAfterScan emptyTrashAfterScan
     * @param seriesCover seriesCover
     * @param hashFiles hashFiles
     * @param hashPages hashPages
     * @param analyzeDimensions analyzeDimensions
     * @param oneshotsDirectory oneshotsDirectory
     * @param unavailable unavailable
     */
    @ApiStatus.Internal
    public LibraryDto(String id, String name, String root, Boolean importComicInfoBook, Boolean importComicInfoSeries, Boolean importComicInfoCollection, Boolean importComicInfoReadList, Boolean importComicInfoSeriesAppendVolume, Boolean importEpubBook, Boolean importEpubSeries, Boolean importMylarSeries, Boolean importLocalArtwork, Boolean importBarcodeIsbn, Boolean scanForceModifiedTime, String scanInterval, Boolean scanOnStartup, Boolean scanCbx, Boolean scanPdf, Boolean scanEpub, String[] scanDirectoryExclusions, Boolean repairExtensions, Boolean convertToCbz, Boolean emptyTrashAfterScan, String seriesCover, Boolean hashFiles, Boolean hashPages, Boolean analyzeDimensions, String oneshotsDirectory, Boolean unavailable) {
        this.id = id;
        this.name = name;
        this.root = root;
        this.importComicInfoBook = importComicInfoBook;
        this.importComicInfoSeries = importComicInfoSeries;
        this.importComicInfoCollection = importComicInfoCollection;
        this.importComicInfoReadList = importComicInfoReadList;
        this.importComicInfoSeriesAppendVolume = importComicInfoSeriesAppendVolume;
        this.importEpubBook = importEpubBook;
        this.importEpubSeries = importEpubSeries;
        this.importMylarSeries = importMylarSeries;
        this.importLocalArtwork = importLocalArtwork;
        this.importBarcodeIsbn = importBarcodeIsbn;
        this.scanForceModifiedTime = scanForceModifiedTime;
        this.scanInterval = scanInterval;
        this.scanOnStartup = scanOnStartup;
        this.scanCbx = scanCbx;
        this.scanPdf = scanPdf;
        this.scanEpub = scanEpub;
        this.scanDirectoryExclusions = scanDirectoryExclusions;
        this.repairExtensions = repairExtensions;
        this.convertToCbz = convertToCbz;
        this.emptyTrashAfterScan = emptyTrashAfterScan;
        this.seriesCover = seriesCover;
        this.hashFiles = hashFiles;
        this.hashPages = hashPages;
        this.analyzeDimensions = analyzeDimensions;
        this.oneshotsDirectory = oneshotsDirectory;
        this.unavailable = unavailable;
    }
}
