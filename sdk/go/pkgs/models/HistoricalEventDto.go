// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type HistoricalEventDto struct {
	Type       *string     `json:"type" form:"name=type"`
	Timestamp  *string     `json:"timestamp" form:"name=timestamp"`
	BookId     *string     `json:"bookId" form:"name=bookId"`
	SeriesId   *string     `json:"seriesId" form:"name=seriesId"`
	Properties *Properties `json:"properties" form:"name=properties,json"`
}
