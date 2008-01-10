/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.accada.ale.wsdl.ale.epcglobal;

import java.rmi.RemoteException;

import org.accada.ale.xsd.ale.epcglobal.LRSpec;

public class ALEServicePortTypeProxy implements org.accada.ale.wsdl.ale.epcglobal.ALEServicePortType {
  private String _endpoint = null;
  private org.accada.ale.wsdl.ale.epcglobal.ALEServicePortType aLEServicePortType = null;
  
  public ALEServicePortTypeProxy() {
    _initALEServicePortTypeProxy();
  }
  
  private void _initALEServicePortTypeProxy() {
    try {
      aLEServicePortType = (new org.accada.ale.wsdl.ale.epcglobal.ALEServiceLocator()).getALEServicePort();
      if (aLEServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aLEServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aLEServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aLEServicePortType != null)
      ((javax.xml.rpc.Stub)aLEServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.accada.ale.wsdl.ale.epcglobal.ALEServicePortType getALEServicePortType() {
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType;
  }
  
  public org.accada.ale.wsdl.ale.epcglobal.VoidHolder define(org.accada.ale.wsdl.ale.epcglobal.Define parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.DuplicateNameException, org.accada.ale.wsdl.ale.epcglobal.ECSpecValidationException, org.accada.ale.wsdl.ale.epcglobal.SecurityException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.define(parms);
  }
  
  public org.accada.ale.wsdl.ale.epcglobal.VoidHolder undefine(org.accada.ale.wsdl.ale.epcglobal.Undefine parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.SecurityException, org.accada.ale.wsdl.ale.epcglobal.NoSuchNameException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.undefine(parms);
  }
  
  public org.accada.ale.xsd.ale.epcglobal.ECSpec getECSpec(org.accada.ale.wsdl.ale.epcglobal.GetECSpec parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.SecurityException, org.accada.ale.wsdl.ale.epcglobal.NoSuchNameException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.getECSpec(parms);
  }
  
  public java.lang.String[] getECSpecNames(org.accada.ale.wsdl.ale.epcglobal.EmptyParms parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.SecurityException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.getECSpecNames(parms);
  }
  
  public org.accada.ale.wsdl.ale.epcglobal.VoidHolder subscribe(org.accada.ale.wsdl.ale.epcglobal.Subscribe parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.InvalidURIException, org.accada.ale.wsdl.ale.epcglobal.SecurityException, org.accada.ale.wsdl.ale.epcglobal.DuplicateSubscriptionException, org.accada.ale.wsdl.ale.epcglobal.NoSuchNameException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.subscribe(parms);
  }
  
  public org.accada.ale.wsdl.ale.epcglobal.VoidHolder unsubscribe(org.accada.ale.wsdl.ale.epcglobal.Unsubscribe parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.InvalidURIException, org.accada.ale.wsdl.ale.epcglobal.NoSuchSubscriberException, org.accada.ale.wsdl.ale.epcglobal.SecurityException, org.accada.ale.wsdl.ale.epcglobal.NoSuchNameException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.unsubscribe(parms);
  }
  
  public org.accada.ale.xsd.ale.epcglobal.ECReports poll(org.accada.ale.wsdl.ale.epcglobal.Poll parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.SecurityException, org.accada.ale.wsdl.ale.epcglobal.NoSuchNameException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.poll(parms);
  }
  
  public org.accada.ale.xsd.ale.epcglobal.ECReports immediate(org.accada.ale.wsdl.ale.epcglobal.Immediate parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.ECSpecValidationException, org.accada.ale.wsdl.ale.epcglobal.SecurityException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.immediate(parms);
  }
  
  public java.lang.String[] getSubscribers(org.accada.ale.wsdl.ale.epcglobal.GetSubscribers parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException, org.accada.ale.wsdl.ale.epcglobal.SecurityException, org.accada.ale.wsdl.ale.epcglobal.NoSuchNameException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.getSubscribers(parms);
  }
  
  public java.lang.String getStandardVersion(org.accada.ale.wsdl.ale.epcglobal.EmptyParms parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.getStandardVersion(parms);
  }
  
  public java.lang.String getVendorVersion(org.accada.ale.wsdl.ale.epcglobal.EmptyParms parms) throws java.rmi.RemoteException, org.accada.ale.wsdl.ale.epcglobal.ImplementationException{
    if (aLEServicePortType == null)
      _initALEServicePortTypeProxy();
    return aLEServicePortType.getVendorVersion(parms);
  }

  public AddReadersResult addReaders(AddReaders parms) throws RemoteException,
		ImmutableReaderException, InUseException, NoSuchNameException,
		ImplementationException, SecurityException,
		NonCompositeReaderException, ReaderLoopException, ValidationException {

	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.addReaders(parms);
  }

  public DefineReaderResult defineReader(DefineReader parms)
		throws RemoteException, ImplementationException, SecurityException,
		DuplicateNameException, ValidationException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.defineReader(parms);
  }

  public LRSpec getLRSpec(GetLRSpec parms) throws RemoteException,
		NoSuchNameException, ImplementationException, SecurityException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.getLRSpec(parms);
  }

  public String[] getLogicalReaderNames(EmptyParms parms) throws RemoteException,
		ImplementationException, SecurityException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.getLogicalReaderNames(parms);
  }

  public String getPropertyValue(GetPropertyValue parms) throws RemoteException,
		NoSuchNameException, ImplementationException, SecurityException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.getPropertyValue(parms);
  }

  public RemoveReadersResult removeReaders(RemoveReaders parms)
		throws RemoteException, ImmutableReaderException, InUseException,
		NoSuchNameException, ImplementationException, SecurityException,
		NonCompositeReaderException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.removeReaders(parms);
  }

  public SetPropertiesResult setProperties(SetProperties parms)
		throws RemoteException, ImmutableReaderException, InUseException,
		NoSuchNameException, ImplementationException, SecurityException,
		ValidationException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.setProperties(parms);
  }

  public SetReadersResult setReaders(SetReaders parms) throws RemoteException,
		ImmutableReaderException, InUseException, NoSuchNameException,
		ImplementationException, SecurityException,
		NonCompositeReaderException, ReaderLoopException, ValidationException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.setReaders(parms);
  }

  public UndefineReaderResult undefineReader(UndefineReader parms)
		throws RemoteException, ImmutableReaderException, InUseException,
		NoSuchNameException, ImplementationException, SecurityException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.undefineReader(parms);
  }

  public UpdateReaderResult updateReader(UpdateReader parms)
		throws RemoteException, ImmutableReaderException, InUseException,
		NoSuchNameException, ImplementationException, SecurityException,
		ReaderLoopException, ValidationException {
	
	if (aLEServicePortType == null) {
		_initALEServicePortTypeProxy();
	}
	return aLEServicePortType.updateReader(parms);
  }
  
}