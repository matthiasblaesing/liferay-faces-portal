/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.portal.context;

import com.liferay.faces.util.factory.FactoryExtensionFinder;
import com.liferay.faces.util.helper.Wrapper;


/**
 * @author  Neil Griffin
 */
public abstract class PortletHelperFactory implements Wrapper<PortletHelperFactory> {

	/**
	 * Returns an instance of {@link PortletHelper} from the {@link PortletHelperFactory} found by the {@link
	 * FactoryExtensionFinder}.
	 */
	public static PortletHelper getInstance() {

		PortletHelperFactory portletHelperFactory = (PortletHelperFactory) FactoryExtensionFinder.getFactory(
				PortletHelperFactory.class);

		return portletHelperFactory.getPortletHelper();
	}

	/**
	 * Returns the {@link PortletHelper} instance from the factory delegation chain.
	 */
	public abstract PortletHelper getPortletHelper();
}
