// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package models

type AuthenticationActivityDto struct {
	UserId    *string `json:"userId" form:"name=userId"`
	Email     *string `json:"email" form:"name=email"`
	Ip        *string `json:"ip" form:"name=ip"`
	UserAgent *string `json:"userAgent" form:"name=userAgent"`
	Success   *bool   `json:"success" form:"name=success"`
	Error     *string `json:"error" form:"name=error"`
	DateTime  *string `json:"dateTime" form:"name=dateTime"`
	Source    *string `json:"source" form:"name=source"`
}
