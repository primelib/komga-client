// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type PageHashKnownDto struct {
	Hash         *string `json:"hash" form:"name=hash"`
	Size         *int64  `json:"size" form:"name=size"`
	Action       *string `json:"action" form:"name=action"`
	DeleteCount  *int32  `json:"deleteCount" form:"name=deleteCount"`
	MatchCount   *int32  `json:"matchCount" form:"name=matchCount"`
	Created      *string `json:"created" form:"name=created"`
	LastModified *string `json:"lastModified" form:"name=lastModified"`
}
