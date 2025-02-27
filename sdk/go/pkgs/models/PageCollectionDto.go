// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type PageCollectionDto struct {
	TotalElements    *int64           `json:"totalElements" form:"name=totalElements"`
	TotalPages       *int32           `json:"totalPages" form:"name=totalPages"`
	Pageable         *PageableObject  `json:"pageable" form:"name=pageable,json"`
	Size             *int32           `json:"size" form:"name=size"`
	Content          []*CollectionDto `json:"content" form:"name=content,json"`
	Number           *int32           `json:"number" form:"name=number"`
	Sort             *SortObject      `json:"sort" form:"name=sort,json"`
	First            *bool            `json:"first" form:"name=first"`
	Last             *bool            `json:"last" form:"name=last"`
	NumberOfElements *int32           `json:"numberOfElements" form:"name=numberOfElements"`
	Empty            *bool            `json:"empty" form:"name=empty"`
}
