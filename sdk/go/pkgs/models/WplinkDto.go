// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type WplinkDto struct {
	Title     *string `json:"title" form:"name=title"`
	Rel       *string `json:"rel" form:"name=rel"`
	Href      *string `json:"href" form:"name=href"`
	Type      *string `json:"type" form:"name=type"`
	Templated *bool   `json:"templated" form:"name=templated"`
	WIDTh     *int32  `json:"width" form:"name=width"`
	Height    *int32  `json:"height" form:"name=height"`
}
