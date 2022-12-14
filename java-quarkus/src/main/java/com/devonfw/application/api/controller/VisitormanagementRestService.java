package com.devonfw.application.api.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.api.model.VisitorEto;
import com.devonfw.application.domain.tos.VisitorSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Visitormanagement}.
 */
@Path("/visitormanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface VisitormanagementRestService {

  /**
   * Delegates to {@link Visitormanagement#findVisitor}.
   *
   * @param id the ID of the {@link VisitorEto}
   * @return the {@link VisitorEto}
   */
  @GET
  @Path("/visitor/{id}/")
  public VisitorEto getVisitor(@PathParam("id") long id);

  /**
   * Delegates to {@link Visitormanagement#saveVisitor}.
   *
   * @param visitor the {@link VisitorEto} to be saved
   * @return the recently created {@link VisitorEto}
   */
  @POST
  @Path("/visitor/")
  public VisitorEto saveVisitor(VisitorEto visitor);

  /**
   * Delegates to {@link Visitormanagement#deleteVisitor}.
   *
   * @param id ID of the {@link VisitorEto} to be deleted
   * @return id
   */
  @DELETE
  @Path("/visitor/{id}/")
  public long deleteVisitor(@PathParam("id") long id);

  /**
   * Delegates to {@link Visitormanagement#findVisitorEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for
   *                         finding visitors.
   * @return the {@link Page list} of matching {@link VisitorEto}s.
   */
  @Path("/visitor/search")
  @POST
  public Page<VisitorEto> findVisitors(VisitorSearchCriteriaTo searchCriteriaTo);

}