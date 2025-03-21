// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type BookMetadataDto struct {
	Title           *string       `json:"title" form:"name=title"`
	TitleLock       *bool         `json:"titleLock" form:"name=titleLock"`
	Summary         *string       `json:"summary" form:"name=summary"`
	SummaryLock     *bool         `json:"summaryLock" form:"name=summaryLock"`
	Number          *string       `json:"number" form:"name=number"`
	NumberLock      *bool         `json:"numberLock" form:"name=numberLock"`
	NumberSort      *float32      `json:"numberSort" form:"name=numberSort"`
	NumberSortLock  *bool         `json:"numberSortLock" form:"name=numberSortLock"`
	ReleaseDate     *string       `json:"releaseDate" form:"name=releaseDate"`
	ReleaseDateLock *bool         `json:"releaseDateLock" form:"name=releaseDateLock"`
	Authors         []*AuthorDto  `json:"authors" form:"name=authors,json"`
	AuthorsLock     *bool         `json:"authorsLock" form:"name=authorsLock"`
	Tags            []*string     `json:"tags" form:"name=tags,json"`
	TagsLock        *bool         `json:"tagsLock" form:"name=tagsLock"`
	Isbn            *string       `json:"isbn" form:"name=isbn"`
	IsbnLock        *bool         `json:"isbnLock" form:"name=isbnLock"`
	Links           []*WebLinkDto `json:"links" form:"name=links,json"`
	LinksLock       *bool         `json:"linksLock" form:"name=linksLock"`
	Created         *string       `json:"created" form:"name=created"`
	LastModified    *string       `json:"lastModified" form:"name=lastModified"`
}
