// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type SeriesMetadataDto struct {
	Status               *string              `json:"status" form:"name=status"`
	StatusLock           *bool                `json:"statusLock" form:"name=statusLock"`
	Title                *string              `json:"title" form:"name=title"`
	TitleLock            *bool                `json:"titleLock" form:"name=titleLock"`
	TitleSort            *string              `json:"titleSort" form:"name=titleSort"`
	TitleSortLock        *bool                `json:"titleSortLock" form:"name=titleSortLock"`
	Summary              *string              `json:"summary" form:"name=summary"`
	SummaryLock          *bool                `json:"summaryLock" form:"name=summaryLock"`
	ReadingDirection     *string              `json:"readingDirection" form:"name=readingDirection"`
	ReadingDirectionLock *bool                `json:"readingDirectionLock" form:"name=readingDirectionLock"`
	Publisher            *string              `json:"publisher" form:"name=publisher"`
	PublisherLock        *bool                `json:"publisherLock" form:"name=publisherLock"`
	AgeRating            *int32               `json:"ageRating" form:"name=ageRating"`
	AgeRatingLock        *bool                `json:"ageRatingLock" form:"name=ageRatingLock"`
	Language             *string              `json:"language" form:"name=language"`
	LanguageLock         *bool                `json:"languageLock" form:"name=languageLock"`
	Genres               []*string            `json:"genres" form:"name=genres,json"`
	GenresLock           *bool                `json:"genresLock" form:"name=genresLock"`
	Tags                 []*string            `json:"tags" form:"name=tags,json"`
	TagsLock             *bool                `json:"tagsLock" form:"name=tagsLock"`
	TotalBookCount       *int32               `json:"totalBookCount" form:"name=totalBookCount"`
	TotalBookCountLock   *bool                `json:"totalBookCountLock" form:"name=totalBookCountLock"`
	SharingLabels        []*string            `json:"sharingLabels" form:"name=sharingLabels,json"`
	SharingLabelsLock    *bool                `json:"sharingLabelsLock" form:"name=sharingLabelsLock"`
	Links                []*WebLinkDto        `json:"links" form:"name=links,json"`
	LinksLock            *bool                `json:"linksLock" form:"name=linksLock"`
	AlternateTitles      []*AlternateTitleDto `json:"alternateTitles" form:"name=alternateTitles,json"`
	AlternateTitlesLock  *bool                `json:"alternateTitlesLock" form:"name=alternateTitlesLock"`
	Created              *string              `json:"created" form:"name=created"`
	LastModified         *string              `json:"lastModified" form:"name=lastModified"`
}
