// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type FeedDto struct {
	Metadata     *FeedMetadataDto    `json:"metadata" form:"name=metadata,json"`
	Links        []*WplinkDto        `json:"links" form:"name=links,json"`
	Navigation   []*WplinkDto        `json:"navigation" form:"name=navigation,json"`
	Facets       []*FacetDto         `json:"facets" form:"name=facets,json"`
	Groups       []*FeedGroupDto     `json:"groups" form:"name=groups,json"`
	Publications []*WppublicationDto `json:"publications" form:"name=publications,json"`
}
