package com.ali.headless.counter.internal.resource.v1_0;

import com.ali.headless.counter.resource.v1_0.CounterResource;

import com.liferay.petra.function.UnsafeFunction;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ResourceActionLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.util.ActionUtil;
import com.liferay.portal.vulcan.util.TransformUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotNull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.UriInfo;

/**
 * @author jinos
 * @generated
 */
@Generated("")
@Path("/v1.0")
public abstract class BaseCounterResourceImpl implements CounterResource {

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/counter/getnames'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Path("/counter/getnames")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Counter")})
	public String getCounterGetnames() throws Exception {
		return StringPool.BLANK;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/counter/increment'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Path("/counter/increment")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Counter")})
	public Long getCounterIncrement() throws Exception {
		return 0L;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/counter/increment/{name}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "name")})
	@Path("/counter/increment/{name}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Counter")})
	public Long getCounterIncrementName(
			@NotNull @Parameter(hidden = true) @PathParam("name") String name)
		throws Exception {

		return 0L;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/counter/increment/{name}/{size}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.PATH, name = "name"),
			@Parameter(in = ParameterIn.PATH, name = "size")
		}
	)
	@Path("/counter/increment/{name}/{size}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Counter")})
	public Long getCounterIncrementNameSize(
			@NotNull @Parameter(hidden = true) @PathParam("name") String name,
			@NotNull @Parameter(hidden = true) @PathParam("size") Integer size)
		throws Exception {

		return 0L;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/counter/rename/{oldName}/{newName}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.PATH, name = "oldName"),
			@Parameter(in = ParameterIn.PATH, name = "newName")
		}
	)
	@Path("/counter/rename/{oldName}/{newName}")
	@Tags(value = {@Tag(name = "Counter")})
	public void getCounterRenameOldNameNewName(
			@NotNull @Parameter(hidden = true) @PathParam("oldName") String
				oldName,
			@NotNull @Parameter(hidden = true) @PathParam("newName") String
				newName)
		throws Exception {
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/counter/reset/{name}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "name")})
	@Path("/counter/reset/{name}")
	@Tags(value = {@Tag(name = "Counter")})
	public void getCounterResetName(
			@NotNull @Parameter(hidden = true) @PathParam("name") String name)
		throws Exception {
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/counter/reset/{name}/{size}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.PATH, name = "name"),
			@Parameter(in = ParameterIn.PATH, name = "size")
		}
	)
	@Path("/counter/reset/{name}/{size}")
	@Tags(value = {@Tag(name = "Counter")})
	public void getCounterResetNameSize(
			@NotNull @Parameter(hidden = true) @PathParam("name") String name,
			@NotNull @Parameter(hidden = true) @PathParam("size") Long size)
		throws Exception {
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/headless-counter/v1.0/test/{id}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Operation(description = "its a test")
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "id")})
	@Path("/test/{id}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Counter")})
	public String getTestId(
			@NotNull @Parameter(hidden = true) @PathParam("id") Long id)
		throws Exception {

		return StringPool.BLANK;
	}

	public void setContextAcceptLanguage(AcceptLanguage contextAcceptLanguage) {
		this.contextAcceptLanguage = contextAcceptLanguage;
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany) {

		this.contextCompany = contextCompany;
	}

	public void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {

		this.contextHttpServletRequest = contextHttpServletRequest;
	}

	public void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {

		this.contextHttpServletResponse = contextHttpServletResponse;
	}

	public void setContextUriInfo(UriInfo contextUriInfo) {
		this.contextUriInfo = contextUriInfo;
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser) {

		this.contextUser = contextUser;
	}

	protected Map<String, String> addAction(
		String actionName, GroupedModel groupedModel, String methodName) {

		return ActionUtil.addAction(
			actionName, getClass(), groupedModel, methodName,
			contextScopeChecker, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, Long id, String methodName, Long ownerId,
		String permissionName, Long siteId) {

		return ActionUtil.addAction(
			actionName, getClass(), id, methodName, contextScopeChecker,
			ownerId, permissionName, siteId, contextUriInfo);
	}

	protected Map<String, String> addAction(
		String actionName, String methodName, String permissionName,
		Long siteId) {

		return addAction(
			actionName, siteId, methodName, null, permissionName, siteId);
	}

	protected <T, R> List<R> transform(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transform(collection, unsafeFunction);
	}

	protected <T, R> R[] transform(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction,
		Class<?> clazz) {

		return TransformUtil.transform(array, unsafeFunction, clazz);
	}

	protected <T, R> R[] transformToArray(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction, Class<?> clazz) {

		return TransformUtil.transformToArray(
			collection, unsafeFunction, clazz);
	}

	protected <T, R> List<R> transformToList(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transformToList(array, unsafeFunction);
	}

	protected AcceptLanguage contextAcceptLanguage;
	protected com.liferay.portal.kernel.model.Company contextCompany;
	protected HttpServletRequest contextHttpServletRequest;
	protected HttpServletResponse contextHttpServletResponse;
	protected Object contextScopeChecker;
	protected UriInfo contextUriInfo;
	protected com.liferay.portal.kernel.model.User contextUser;
	protected GroupLocalService groupLocalService;
	protected ResourceActionLocalService resourceActionLocalService;
	protected ResourcePermissionLocalService resourcePermissionLocalService;
	protected RoleLocalService roleLocalService;

}