// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type WpbelongsToDto struct {
	Series     []*WpcontributorDto `json:"series" form:"name=series,json"`
	Collection []*WpcontributorDto `json:"collection" form:"name=collection,json"`
}
