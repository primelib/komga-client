// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package client

import (
	"context"

	"github.com/primelib/komga-client/sdk/go/pkgs/operations"
)

type SettingsControllerService Service

// GetSettingsV1
//
//meta:operation GET /api/v1/settings
func (s *SettingsControllerService) GetSettingsV1(ctx context.Context, req operations.GetSettingsV1Request) (*operations.GetSettingsV1Response, error) {
	return operations.GetSettingsV1(s.client.restyClient, ctx, req)
}

// PatchSettingsV1
//
//meta:operation PATCH /api/v1/settings
func (s *SettingsControllerService) PatchSettingsV1(ctx context.Context, req operations.PatchSettingsV1Request) (*operations.PatchSettingsV1Response, error) {
	return operations.PatchSettingsV1(s.client.restyClient, ctx, req)
}
