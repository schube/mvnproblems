package com.schubec.optitouch.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.schubec.optitouch.shared.models.Product;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("model")
public interface ModelService extends RemoteService {
	ServerResult<List<Product>> getProducts();
}
