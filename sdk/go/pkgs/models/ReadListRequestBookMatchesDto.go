// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ReadListRequestBookMatchesDto struct {
	Request *ReadListRequestBookDto        `json:"request" form:"name=request,json"`
	Matches []*ReadListRequestBookMatchDto `json:"matches" form:"name=matches,json"`
}
