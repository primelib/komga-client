// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type ReadListRequestMatchDto struct {
	ReadListMatch *ReadListMatchDto                `json:"readListMatch" form:"name=readListMatch,json"`
	Requests      []*ReadListRequestBookMatchesDto `json:"requests" form:"name=requests,json"`
	ErrorCode     *string                          `json:"errorCode" form:"name=errorCode"`
}
