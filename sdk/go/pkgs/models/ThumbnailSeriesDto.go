// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ThumbnailSeriesDto struct {
	Id        *string `json:"id" form:"name=id"`
	SeriesId  *string `json:"seriesId" form:"name=seriesId"`
	Type      *string `json:"type" form:"name=type"`
	Selected  *bool   `json:"selected" form:"name=selected"`
	MediaType *string `json:"mediaType" form:"name=mediaType"`
	FileSize  *int64  `json:"fileSize" form:"name=fileSize"`
	WIDTh     *int32  `json:"width" form:"name=width"`
	Height    *int32  `json:"height" form:"name=height"`
}
