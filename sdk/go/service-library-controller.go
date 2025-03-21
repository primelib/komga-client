// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package client

import (
	"context"

	"github.com/primelib/komga-client/sdk/go/pkgs/operations"
)

type LibraryControllerService Service

// GetLibraryByLibraryIDV1
//
//meta:operation GET /api/v1/libraries/{libraryId}
func (s *LibraryControllerService) GetLibraryByLibraryIDV1(ctx context.Context, req operations.GetLibraryByLibraryIDV1Request) (*operations.GetLibraryByLibraryIDV1Response, error) {
	return operations.GetLibraryByLibraryIDV1(s.client.restyClient, ctx, req)
}

// PutLibraryByLibraryIDV1
//
// Deprecated: PutLibraryByLibraryIDV1 is deprecated.
//
//meta:operation PUT /api/v1/libraries/{libraryId}
func (s *LibraryControllerService) PutLibraryByLibraryIDV1(ctx context.Context, req operations.PutLibraryByLibraryIDV1Request) (*operations.PutLibraryByLibraryIDV1Response, error) {
	return operations.PutLibraryByLibraryIDV1(s.client.restyClient, ctx, req)
}

// DeleteLibraryByLibraryIDV1
//
//meta:operation DELETE /api/v1/libraries/{libraryId}
func (s *LibraryControllerService) DeleteLibraryByLibraryIDV1(ctx context.Context, req operations.DeleteLibraryByLibraryIDV1Request) (*operations.DeleteLibraryByLibraryIDV1Response, error) {
	return operations.DeleteLibraryByLibraryIDV1(s.client.restyClient, ctx, req)
}

// PatchLibraryByLibraryIDV1
//
//meta:operation PATCH /api/v1/libraries/{libraryId}
func (s *LibraryControllerService) PatchLibraryByLibraryIDV1(ctx context.Context, req operations.PatchLibraryByLibraryIDV1Request) (*operations.PatchLibraryByLibraryIDV1Response, error) {
	return operations.PatchLibraryByLibraryIDV1(s.client.restyClient, ctx, req)
}

// GetLibrariesV1
//
//meta:operation GET /api/v1/libraries
func (s *LibraryControllerService) GetLibrariesV1(ctx context.Context, req operations.GetLibrariesV1Request) (*operations.GetLibrariesV1Response, error) {
	return operations.GetLibrariesV1(s.client.restyClient, ctx, req)
}

// PostLibrariesV1
//
//meta:operation POST /api/v1/libraries
func (s *LibraryControllerService) PostLibrariesV1(ctx context.Context, req operations.PostLibrariesV1Request) (*operations.PostLibrariesV1Response, error) {
	return operations.PostLibrariesV1(s.client.restyClient, ctx, req)
}

// PostLibraryByLibraryIDScanV1
//
//meta:operation POST /api/v1/libraries/{libraryId}/scan
func (s *LibraryControllerService) PostLibraryByLibraryIDScanV1(ctx context.Context, req operations.PostLibraryByLibraryIDScanV1Request) (*operations.PostLibraryByLibraryIDScanV1Response, error) {
	return operations.PostLibraryByLibraryIDScanV1(s.client.restyClient, ctx, req)
}

// PostLibraryByLibraryIDMetadataRefreshV1
//
//meta:operation POST /api/v1/libraries/{libraryId}/metadata/refresh
func (s *LibraryControllerService) PostLibraryByLibraryIDMetadataRefreshV1(ctx context.Context, req operations.PostLibraryByLibraryIDMetadataRefreshV1Request) (*operations.PostLibraryByLibraryIDMetadataRefreshV1Response, error) {
	return operations.PostLibraryByLibraryIDMetadataRefreshV1(s.client.restyClient, ctx, req)
}

// PostLibraryByLibraryIDEmptyTrashV1
//
//meta:operation POST /api/v1/libraries/{libraryId}/empty-trash
func (s *LibraryControllerService) PostLibraryByLibraryIDEmptyTrashV1(ctx context.Context, req operations.PostLibraryByLibraryIDEmptyTrashV1Request) (*operations.PostLibraryByLibraryIDEmptyTrashV1Response, error) {
	return operations.PostLibraryByLibraryIDEmptyTrashV1(s.client.restyClient, ctx, req)
}

// PostLibraryByLibraryIDAnalyzeV1
//
//meta:operation POST /api/v1/libraries/{libraryId}/analyze
func (s *LibraryControllerService) PostLibraryByLibraryIDAnalyzeV1(ctx context.Context, req operations.PostLibraryByLibraryIDAnalyzeV1Request) (*operations.PostLibraryByLibraryIDAnalyzeV1Response, error) {
	return operations.PostLibraryByLibraryIDAnalyzeV1(s.client.restyClient, ctx, req)
}
