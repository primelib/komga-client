// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package enums

type ThumbnailSizeEnum string

const (
	ThumbnailSizeEnumDefault ThumbnailSizeEnum = "DEFAULT"
	ThumbnailSizeEnumLarge   ThumbnailSizeEnum = "LARGE"
	ThumbnailSizeEnumMedium  ThumbnailSizeEnum = "MEDIUM"
	ThumbnailSizeEnumXlarge  ThumbnailSizeEnum = "XLARGE"
)

func (e ThumbnailSizeEnum) ToPointer() *ThumbnailSizeEnum {
	return &e
}
