package com.schubec.optitouch.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.schubec.optitouch.shared.models.Product;

public interface ModelServiceAsync {
	void getProducts(AsyncCallback<ServerResult<List<Product>>> callback);
}
