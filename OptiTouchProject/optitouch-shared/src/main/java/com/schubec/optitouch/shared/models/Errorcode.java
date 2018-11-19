package com.schubec.optitouch.shared.models;

import com.google.gwt.user.client.rpc.IsSerializable;

public enum Errorcode implements IsSerializable{
	NoError, GenericError, DatasourceError, WrongPassword, FeatureDisabled
}
