// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type CollectionUpdateDto struct {
	Name      *string   `json:"name" form:"name=name"`
	Ordered   *bool     `json:"ordered" form:"name=ordered"`
	SeriesIDS []*string `json:"seriesIds" form:"name=seriesIds,json"`
}
