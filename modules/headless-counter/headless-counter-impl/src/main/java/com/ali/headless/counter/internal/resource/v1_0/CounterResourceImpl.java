/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.ali.headless.counter.internal.resource.v1_0;

import com.ali.headless.counter.resource.v1_0.CounterResource;
import com.ali.service.counter.service.FooLocalService;

import java.util.List;
import java.util.StringJoiner;

import javax.validation.constraints.NotNull;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author jinos
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/counter.properties",
	scope = ServiceScope.PROTOTYPE, service = CounterResource.class
)
public class CounterResourceImpl extends BaseCounterResourceImpl {

	@Override
	public String getTestId(@NotNull Long id) throws Exception {
		return "hi beach";
	}

	@Override
	public String getCounterGetnames() throws Exception {
		StringJoiner stringJoiner = new StringJoiner(",");

		List<String> list = _fooLocalService.getNames();

		list.forEach(stringJoiner::add);

		return stringJoiner.toString();
	}

	@Override
	public Long getCounterIncrement() throws Exception {
		return _fooLocalService.increment();
	}

	@Override
	public Long getCounterIncrementName(@NotNull String name) throws Exception {
		return _fooLocalService.increment(name);
	}

	@Override
	public Long getCounterIncrementNameSize(
			@NotNull String name, @NotNull Integer size)
		throws Exception {

		return _fooLocalService.increment(name, size);
	}

	@Override
	public void getCounterRenameOldNameNewName(
			@NotNull String oldName, @NotNull String newName)
		throws Exception {

		_fooLocalService.rename(oldName, newName);
	}

	@Override
	public void getCounterResetName(@NotNull String name) throws Exception {
		_fooLocalService.reset(name);
	}

	@Override
	public void getCounterResetNameSize(
			@NotNull String name, @NotNull Long size)
		throws Exception {

		_fooLocalService.reset(name, size);
	}

	@Reference
	private FooLocalService _fooLocalService;

}