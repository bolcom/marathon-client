package mesosphere.marathon.client;

import feign.RequestLine;
import mesosphere.marathon.client.model.v2.*;

import javax.inject.Named;

public interface Marathon {
	@RequestLine("GET /v2/apps")
	GetAppsResponse getApps();

	@RequestLine("GET /v2/apps/{id}")
	GetAppResponse getApp(@Named("id") String id);

	@RequestLine("GET /v2/apps/{id}/tasks")
	GetAppTasksResponse getAppTasks(@Named("id") String id);

	@RequestLine("GET /v2/tasks")
	GetTasksResponse getTasks();

	@RequestLine("POST /v2/apps")
	void createApp(App app);

	@RequestLine("PUT /v2/apps/{app_id}")
	void updateApp(@Named("app_id") String appId, App app);

	@RequestLine("DELETE /v2/apps/{id}")
	void deleteApp(@Named("id") String id);

	@RequestLine("DELETE /v2/apps/{app_id}/tasks?host={host}&scale={scale}")
	DeleteAppTasksResponse deleteAppTasks(@Named("app_id") String appId,
										  @Named("host") String host, @Named("scale") String scale);

	@RequestLine("DELETE /v2/apps/{app_id}/tasks/{task_id}?scale={scale}")
	DeleteAppTaskResponse deleteAppTask(@Named("app_id") String appId,
										@Named("task_id") String taskId, @Named("scale") String scale);

	@RequestLine("GET /v2/groups")
	GetGroupsResponse getGroups();

	@RequestLine("GET /v2/groups/{groupId}")
	Group getGroup(@Named("groupId") String groupId);

	@RequestLine("POST /v2/groups/")
	void createGroup(Group group);

	@RequestLine("PUT /v2/groups/{groupId}")
	void updateGroup(@Named("groupId") String groupId, Group group);

	@RequestLine("PUT /v2/groups/{groupId}?force={force}")
	void updateGroup(@Named("groupId") String groupId, Group group, @Named("force") boolean force);

	@RequestLine("DELETE /v2/groups/{groupId}")
	void deleteGroup(@Named("groupId") String groupId);

	@RequestLine("DELETE /v2/groups/{groupId}?force={force}")
	void deleteGroup(@Named("groupId") String groupId, @Named("force") boolean force);
}
