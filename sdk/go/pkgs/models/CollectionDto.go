// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type CollectionDto struct {
	Id               *string   `json:"id" form:"name=id"`
	Name             *string   `json:"name" form:"name=name"`
	Ordered          *bool     `json:"ordered" form:"name=ordered"`
	SeriesIDS        []*string `json:"seriesIds" form:"name=seriesIds,json"`
	CreatedDate      *string   `json:"createdDate" form:"name=createdDate"`
	LastModifiedDate *string   `json:"lastModifiedDate" form:"name=lastModifiedDate"`
	Filtered         *bool     `json:"filtered" form:"name=filtered"`
}
