// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type SharedLibrariesUpdateDto struct {
	All        *bool     `json:"all" form:"name=all"`
	LibraryIDS []*string `json:"libraryIds" form:"name=libraryIds,json"`
}
