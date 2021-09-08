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

package com.ali.service.counter.service.impl;

import com.ali.service.counter.service.base.FooLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.ali.service.counter.service.FooLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalServiceBaseImpl
 */
@Component(
        property = "model.class.name=com.ali.service.counter.model.Foo",
        service = AopService.class
)
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. Use <code>com.ali.service.counter.service.FooLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.ali.service.counter.service.FooLocalServiceUtil</code>.
     */

    public void rename(String oldName, String newName) {
        counterLocalService.rename(oldName, newName);
    }

    public List<String> getNames() {
        return counterLocalService.getNames();
    }

    public void reset(String name) {
        counterLocalService.reset(name);
    }

    public void reset(String name, long size) {
        counterLocalService.reset(name, size);
    }

    public long increment() {
        return counterLocalService.increment();
    }

    public long increment(String name) {
        return counterLocalService.increment(name);
    }

    public long increment(String name, int size) {
        return counterLocalService.increment(name, size);
    }
}